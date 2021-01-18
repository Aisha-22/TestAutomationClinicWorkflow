ClinicWorkflowAutomation

*About the project
>>Automating the ClinicWorkflow web App
https://clinic-workflow.web.app/

Basic Knowledge:
**Two common steps to invoke the Chrome browser
>Setting the Properties and the Path
Initialize browser

**Challenges
>>Trying to automate 2 buttons that have the same element using Parent Child Xpath. 
Used Xpath with index 

**Implicit and Explicit
>Is based on the search results
>When your code/test executes faster than your browser, test works with elements that are not there.

*Implicit Wait Machine:
> ImplicitWait is applied Globally - in a global level, it's telling the program to Waiting for a number of seconds before throwing exception.
Initially it's saying, So whenever I tell my driver to click on something and the results are not found, please don't fail immediately,
wait for a number of seconds
Advantages: Defining it globally, so that is there is a 100 steps in your application then each and every step there is wait time, because you are
clicking 100 clicks which navigate to 100 pages, so each page has a time limit to load, so if you declare it once globally that that's it

*Explicit Wait:
>Is used to target specific Elements e.g specific to all location searches

>Implicit and Explicit are both are combined used to achieve synchronization successfully in a realtime project.

Added a List Element and a find element by text()




