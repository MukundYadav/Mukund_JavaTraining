package exercise5;

public class BridgePattern {
	public static void main(String[] args) {
		KFCBangalore kfcbangalore=new MahadevapuraBranch();
		KFC kfc=new BangaloreBranch(kfcbangalore);
		
		kfc.setRules();
		
		
	}
}
interface KFC{
	public void setRules();
}
interface KFCBangalore{
	public void prepareKFC();
}

class MahadevapuraBranch implements KFCBangalore{

	@Override
	public void prepareKFC() {
		System.out.println("prepare KFC as per KFC guidelines");
		
	}
	
}
class BangaloreBranch implements KFC{
	private KFCBangalore kfcb;
	
	public BangaloreBranch(KFCBangalore kfcb) {
		this.kfcb=kfcb;
	}

	@Override
	public void setRules() {
		kfcb.prepareKFC();
		
	}
	
}

