

# PL_Project

Here are the steps to run the program.

Upon running the program, the user will be allowed to input a "-create" command to 
generate a JSON file or a "-decipher" command to fetch a JSON file already created and parse the contents 

if no arguments are given then the program with run both -create and -deciper in that order and the user will be prompted with 3 fields 



********************************************************************************************************************************************
 -Create or No argument given 


ID: the user is prompted with an ID which can be an integer of any length
NAME: the user is prompted with a NAME which can be a string or set of characters of any length, this includes spaces and special characters 
AGE: the user is prompted with an AGE which can be an integer of any length 

Once these 3 arguments are filled out the use is prompted with a field to input the name of the 
JSON file they wish to create, this filename can include 
string characters,integers and spaces. Once a file is named, it is saved to the local directory 





*********************************************************************************************************************************************
-Decipher or No argument given 



The user will be prompted with a name for the JSON file they wish to retrieve from the local directory that they wish to decipher and parse
This field must include the name of an existing file, if the file does not exist, a try catch with display the file cannot be found 
The field must include the name of the existing file without the extension .JSON, only the file name is required to retrieve and parse the data from that particular file 





**********************************************************************************************************************************************
