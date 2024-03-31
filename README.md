Приложение "Калькулятор отпускных".
Микросервис на SpringBoot + Java 17 c одним API:
GET "/calculate"

Request JSON: 
"averageSalary" Средняя зарплата за год
"dateVacation" Дата начала отпуска
"countDay" Количество дней в отпуске

    {
        "averageSalary": "793000", 
        "dateStartVacation": "2024-02-01", 
        "countDay": 7 
    }
    
        
        
Response JSON:
"endVacationDate" Дата окончания отпуска (подсчитывается с учётом праздников)
"holidayPay" Отпускные

    {
        "endVacationDate": "2024-02-07",
        "holidayPay": 157882.25
    }
        
        
  
