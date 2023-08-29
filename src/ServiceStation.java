public class ServiceStation implements ServStation {
    @Override
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.service();
    }
}