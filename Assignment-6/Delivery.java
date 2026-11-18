class Delivery{
    double orderAmount;
    public Delivery(double orderAmount){
        this.orderAmount=orderAmount;
    }
    public double calculateDeliveryCharge(){
        return orderAmount;
    }
}