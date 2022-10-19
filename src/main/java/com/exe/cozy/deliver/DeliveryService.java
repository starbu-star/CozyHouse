package com.exe.cozy.deliver;

import java.util.List;

import com.exe.cozy.domain.DeliverDto;

public interface DeliveryService {
    public int maxNumDeliver();
    public int insertDeliver(DeliverDto ddto);

    public List<DeliverDto> listDeliver(String customerEmail);
    
    public void deleteDeliver(int deliverNum);
    
    public int updateDeliver(DeliverDto ddto);
    public int selectDeliverType(String deliverType);
}
