# TAGLINE

Manage Simple Notification Service topics and subscriptions.

# TLDR

**Create a new SNS topic**

```aws sns create-topic --name [topic-name]```

**List all topics**

```aws sns list-topics```

**Publish a message** to a topic

```aws sns publish --topic-arn [arn:aws:sns:region:account:topic-name] --message "[Hello World]"```

**Subscribe an email** to a topic

```aws sns subscribe --topic-arn [arn:aws:sns:region:account:topic-name] --protocol email --notification-endpoint [email@example.com]```

**Subscribe a Lambda function** to a topic

```aws sns subscribe --topic-arn [arn:aws:sns:region:account:topic-name] --protocol lambda --notification-endpoint [arn:aws:lambda:region:account:function:name]```

**List subscriptions** for a topic

```aws sns list-subscriptions-by-topic --topic-arn [arn:aws:sns:region:account:topic-name]```

**Delete a topic**

```aws sns delete-topic --topic-arn [arn:aws:sns:region:account:topic-name]```

# SYNOPSIS

**aws sns** _subcommand_ [_options_]

# DESCRIPTION

**aws sns** is the AWS CLI interface for Amazon Simple Notification Service (SNS), a fully managed messaging service for application-to-application (A2A) and application-to-person (A2P) communication.

SNS enables pub/sub messaging where publishers send messages to topics, and subscribers receive notifications via protocols including HTTP/HTTPS, email, SMS, SQS, Lambda, and mobile push notifications.

# SUBCOMMANDS

**Topic Management**
> create-topic, delete-topic, list-topics, get-topic-attributes, set-topic-attributes

**Publishing**
> publish, publish-batch

**Subscriptions**
> subscribe, unsubscribe, list-subscriptions, list-subscriptions-by-topic, confirm-subscription, get-subscription-attributes, set-subscription-attributes

**Mobile Push**
> create-platform-application, create-platform-endpoint, delete-platform-application, delete-endpoint, list-platform-applications, list-endpoints-by-platform-application

**SMS**
> set-sms-attributes, get-sms-attributes, check-if-phone-number-is-opted-out, opt-in-phone-number, list-phone-numbers-opted-out

**Permissions**
> add-permission, remove-permission, tag-resource, untag-resource, list-tags-for-resource

# CAVEATS

Email subscriptions require confirmation by the recipient before they receive messages. SMS messages have regional restrictions and may require spending limit increases. Message size is limited to 256KB for standard topics. FIFO topics require compatible SQS FIFO queue subscribers.

# HISTORY

Amazon SNS launched in **April 2010** as a push notification service. It has evolved from simple pub/sub messaging to support mobile push notifications, SMS, and advanced features like message filtering, dead-letter queues, and FIFO topics.

# SEE ALSO

[aws](/man/aws)(1), [aws-sqs](/man/aws-sqs)(1), [aws-ses](/man/aws-ses)(1)
