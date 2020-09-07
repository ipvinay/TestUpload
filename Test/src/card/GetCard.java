package card;

import com.authentic.secure.SecurePANField;

public class GetCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		SecurePANField sPAN = SecurePANField.fromEncrypted("A6CE721D80C087466611A6ECCBE512B7D80DD2A94784C5BA6A7157EFEF3C581C", 986);
		System.out.println("Clear PAN : " + sPAN.getClear());
		
		/*SecurePANField sACN = SecurePANField.fromEncrypted("9D22050B514B50EC272A10D715C3F584", 986);
		System.out.println("Clear ACN : " + sACN.getClear());
		
		//FB7E3F05201D903AD7E5613588095801E90797EF50E25F650D017732D6D08C84
		SecurePANField sACNc = SecurePANField.fromEncrypted("FB7E3F05201D903AD7E5613588095801E90797EF50E25F650D017732D6D08C84", 986);
		System.out.println("Clear ACN : " + sACN.getClear());
*/	}

}
