import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class SampleP3 extends JFrame
{
   private JTable tb;
   private JScrollPane sp;

   public static void main(String[] args)
   {
      SampleP3 sm = new SampleP3();
   }
   public SampleP3()
   {
      //�^�C�g���̐ݒ�
      super("�T���v��");

      //�R���|�[�l���g�̍쐬
      tb = new JTable();
      sp = new JScrollPane(tb);

      //�R���e�i�ւ̒ǉ�
      add(sp);

      //���X�i�̓o�^
      addWindowListener(new SampleWindowListener());

      //�t���[���̐ݒ�
      setSize(300, 300);
      setVisible(true);

      try{
         //�ڑ��̏���
         String url = "jdbc:derby:fooddb;create=true";
         String usr = "";
         String pw = "";

         //�f�[�^�x�[�X�ւ̐ڑ�
         Connection cn = DriverManager.getConnection(url, usr, pw);

         //�₢���킹�̏���
         Statement st = cn.createStatement();
         String qry = "SELECT * FROM �ʕ��\";

         //�₢���킹
         ResultSet rs = st.executeQuery(qry);
         tb.setModel(new MyTableModel(rs));

         //�ڑ��̃N���[�Y
         rs.close();
         st.close();
         cn.close();
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }

   //���X�i�N���X
   class SampleWindowListener extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         System.exit(0);
      }
   }

   //���f���N���X
   class MyTableModel extends AbstractTableModel
   {
      private ArrayList<String> colname;
      private ArrayList<ArrayList> data;

      public MyTableModel(ResultSet rs)
      {
         try{

            //�񐔂̎擾
            ResultSetMetaData rm = rs.getMetaData();
            int cnum = rm.getColumnCount();
            colname = new ArrayList<String>(cnum);

            //�񖼂̎擾
            for(int i=1; i<=cnum; i++){
               colname.add(rm.getColumnName(i));
            }

            //�s�̎擾
            data = new ArrayList<ArrayList>(); 
            while(rs.next()){
               ArrayList<String> rowdata = new ArrayList<String>();
               for(int i=1; i<=cnum; i++){
                  rowdata.add(rs.getObject(i).toString());
               }
               data.add(rowdata);
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }
      }
      public int getRowCount() 
      {
         return data.size();
      }
      public int getColumnCount() 
      {
         return colname.size();
      }
      public Object getValueAt(int row, int column) 
      {
         ArrayList rowdata = (ArrayList) (data.get(row));
         return rowdata.get(column);
      }
      public String getColumnName(int column) 
      {
         return (String) colname.get(column);
      }
   }
}
