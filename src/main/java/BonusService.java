public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1; //процент для регеср.3 не рег 1
        long bonus = amount * percent / 100; //расчет бонусного скидоса
        long limit = 500; //лимит
        if (bonus > limit) { // если бонус больше лимита начисляется только лимит
            bonus = limit;
        }
        return bonus;
    }
}
