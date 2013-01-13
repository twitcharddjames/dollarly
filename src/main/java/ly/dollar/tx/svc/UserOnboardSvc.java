package ly.dollar.tx.svc;




import ly.dollar.tx.entity.DollarlyAnonPhoneResponse;
import ly.dollar.tx.entity.DollarlyUserResponse;
import ly.dollar.tx.entity.IouOrder;
import ly.dollar.tx.entity.Sms;


public interface UserOnboardSvc
{

	
	DollarlyAnonPhoneResponse createAnonPhone(Sms sms, String entity) throws Exception;
	
	void sendOnboardingMessage(IouOrder iou, Long payer, Long payee) throws Exception;
}

