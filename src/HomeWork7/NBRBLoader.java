package HomeWork7;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        //TODO дописываем код сюда
        String nameCur = currencyName.name();
         double value = 0;
        if (content.contains(nameCur)){

            int index = content.lastIndexOf(":");
            String subStr = content.substring(index+1, content.length()-2);
            value = Double.parseDouble(subStr);

        }

        return value;
    }
}
