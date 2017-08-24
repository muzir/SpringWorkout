-- Application User should be defined in application configuration
CREATE USER 'monty'@'localhost' IDENTIFIED BY 'rzeeeVUCrio8gKJmSMnt';
GRANT Delete ON SpringWorkout.* TO 'monty'@'localhost';
GRANT Insert ON SpringWorkout.* TO 'monty'@'localhost';
GRANT Select ON SpringWorkout.* TO 'monty'@'localhost';
GRANT Update ON SpringWorkout.* TO 'monty'@'localhost';

GRANT Alter ON SpringWorkout.* TO 'monty'@'localhost';
GRANT Create ON SpringWorkout.* TO 'monty'@'localhost';
GRANT Create view ON SpringWorkout.* TO 'monty'@'localhost';
GRANT Delete ON SpringWorkout.* TO 'monty'@'localhost';

FLUSH PRIVILEGES;