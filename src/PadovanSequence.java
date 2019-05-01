public class PadovanSequence {

    private int[] getSequenceWithLength(int length) {

        int[] results = new int[length];

        for(int n = 0; n < length; n++) {
            if(n==0) {
                results[n] = 0;
            }else if(n < 3) {
                results[n] = 1;
            } else {
                results[n] = results[n - 3] + results[n - 2];
            }
        }

        return results;
    }

    public static void main(String[] args) {

        int length = 10;

        PadovanSequence padSeqObj = new PadovanSequence();

        int[] padSeq = padSeqObj.getSequenceWithLength(length);

        System.out.printf("Item %d of Padovan Sequence = %d%n", length, padSeq[length-1]);

        System.out.print("Full Padovan Sequence: ");

        for(int n = 0; n < padSeq.length; n++) {

            if(n > 0) {
                System.out.print(", ");
            }

            System.out.printf("%d",  padSeq[n]);
        }

        System.out.println();
    }

}
