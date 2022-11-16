/**
 * ���l�v�Z�T���v���N���X<br>
 * �v���O�������s���̈������悵�ďo�͂���
 * @author Yuri Sakashita
 * @version 1.0
 */
public class sample_manual {
    /**
     * main���\�b�h
     * @param args ���s������
     * @see  java.lang.Integer#valueOf
     * @exception ArrayIndexOutOfBoundsException �v���O�������s�������Ȃ��̏ꍇ�ɔ���
     */
    public static void main(String[] args) {
        try {
            int x = Integer.valueOf(args[0]);
            System.out.print(x + "*" + x + "=" + calc(x));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�z��͈̔͊O�Q�Ɨ�O");
        }
    }
    
    /**
     * calc���\�b�h<br>
     * �����̓��l��Ԃ�
     * @param i ��悷�鐔�l
     * @return �����l���悵�����l
     */
    static int calc(int i) {
        int j = i*i;
        return j;
    }
}
