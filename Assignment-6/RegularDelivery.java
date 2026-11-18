class RegularDelivery extends Delivery{
    public RegularDelivery(double orderAmount){
        super(orderAmount);
    }
        public double calculateDeliveryCharge(){
            return orderAmount+40;
    }
}