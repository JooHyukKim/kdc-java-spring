package com.fastcampus.faststore.type;

public enum DiscountType {
    AMOUNT {
        @Override
        public long discountedPrice(long oldPrice, long discountAmount) {
            long newPrice = oldPrice - discountAmount;
            return validDiscount(oldPrice, newPrice);
        }
    },
    PERCENT {
        @Override
        public long discountedPrice(long oldPrice, long percent) {
            long newPrice = oldPrice - (long) (((double) oldPrice) * ((double) percent / 100));
            return validDiscount(oldPrice, newPrice);
        }
    };

    public abstract long discountedPrice(long oldPrice, long amount);

    public long validDiscount(long oldPrice, long newPrice) {
        if (newPrice > oldPrice) throw new RuntimeException("할인된 가격이 원래가격보다 더 비쌉니다.");
        return newPrice;
    }
}
