        
    public  class Invoice implements Payable {
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double pricePerItem;
        public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.quantity = quantity;
            this.pricePerItem = pricePerItem;
        }
        public String getPartNumber() {
            return partNumber;
        }
        public String getPartDescription() {
            return partDescription;
        }
        public int getQuantity() {
            return quantity;
        }
        public double getPricePerItem() {
            return pricePerItem;
        }
        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }
        public void setPartDescription(String partDescription) {
            this.partDescription = partDescription;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public void setPricePerItem(double pricePerItem) {
            this.pricePerItem = pricePerItem;
        }
        @Override
        public double getPaymentAmount() {
            return quantity * pricePerItem;
        }
        @Override
        public String toString() {
            return "Invoice{" +
                    "partNumber='" + partNumber + '\'' +
                    ", partDescription='" + partDescription + '\'' +
                    ", quantity=" + quantity +
                    ", pricePerItem=" + pricePerItem +
                    '}';
        }
    }
