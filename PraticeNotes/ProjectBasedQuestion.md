# A REST API is returning 500 errors. How will you debug?

HTTP 500 error means the request reached the server successfully, but an un-handled exception occuer while processing it.

. Nullpointer exception
. Database connection failure
. SQL exception
. Outofmemory exception

How should we check the 500 error

Step 1 : Verify the error
Step 2 : Check application logs
Step 3 : Identify which layer fails.


# Tell me a challenging production issue you resolved.

To solve a problem I fallow the STAR method.

Situation - What happend
Task - What is my responsibility
Action - What did I do.
Result - what was the outcome.

# How do you ensure code quality before deployment? 

Before deployment we need to check multiple quality gets including code reviews, unit testing, code coverage checks, static code analysis, integration testing, CI/CD pipeline validation.

1. Code review
2. Unit testing(Junit)
3. Code coverage(We measure coverage in JaCOCO)
4. SonarQube Analysis
5. Integration testing
6. API testing
7. Database validation
8. Security validation

# Explain your current project architecture.

                 Users
                   |
                   v
            Angular UI
                   |
             HTTPS Request
                   |
                   v
            Load Balancer
                   |
                   v
             API Gateway
                   |
      --------------------------------
      |              |              |
      v              v              v
 Member Service  Provider Service  Claims Service
      |              |              |
      --------------------------------
                   |
                   v
                Kafka
                   |
      --------------------------------
      |              |              |
      v              v              v
 Notification     Audit        Payment
    Service       Service      Service
                   |
                   v
            Oracle Database

# Explain Kafka and Event-Driven Architecture

Kafka acts as a middleman between services. Instead of services calling each other directly, they exchange events through Kafka.

Kafka flow :

       User Submits Claim
              |
              v
       Claims Service
              |
              v
       Save Claim in DB
              |
              v
       Kafka Producer
              |
              v
       claim-created-topic
              |
       -------------------------
       |          |            |
       v          v            v
       Payment  Notification  Audit
       Consumer  Consumer    Consumer

# Explain JWT Authentication flow.
JWT (JSON Web Token) is a compact, secure token used for authentication and authorization between client and server.

# Production application is down. What will you check first?

1. Verify the issue.
2. Check monitoring tools.
3. Check application logs.
4. Check whether application process is running.
5. Check container/kubernetes
6. Check database connectivity
7. Check recent deployment.
8. Check external dependency.
9. Check resource utilization.
