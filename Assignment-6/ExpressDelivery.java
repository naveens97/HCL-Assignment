class ExpressDelivery extends Delivery{
    public ExpressDelivery(double orderAmount){
        super(orderAmount);
    }
        public double calculateDeliveryCharge(){
            return orderAmount+(orderAmount*0.05)+80;
    }
}