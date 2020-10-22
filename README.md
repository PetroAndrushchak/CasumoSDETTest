
#Answers for the question from the task
1. To monitor the reliability of the service I would run a health check for the service every 30 minutes in any continuous integration tool (Jenkins, AWS Code Build). When the test is failing i would send an email or message to the corporate chat for the team, stating service is down.
2. Regarding security of the service, there are a lot of best practices on how to implement a solution over the internet. So I would consider firstly looking at the solution. And ask following questions:
    -  Do we use API gateway ?
    -  Do we use HTTPS over HTTP ?
    -  Are our api endpoint using authentication and authorization ?

3. As for the QA  team I could also do some testing around security. This checklist could help us to identify issues. 
https://github.com/shieldfy/API-Security-Checklist
