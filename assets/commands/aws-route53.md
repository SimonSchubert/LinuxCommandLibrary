# TLDR

**List all hosted zones** in your account

```aws route53 list-hosted-zones```

**Get details** of a specific hosted zone

```aws route53 get-hosted-zone --id [/hostedzone/ZONE_ID]```

**List DNS records** in a hosted zone

```aws route53 list-resource-record-sets --hosted-zone-id [ZONE_ID]```

**Create a new hosted zone** for a domain

```aws route53 create-hosted-zone --name [example.com] --caller-reference [unique-string]```

**Test a DNS answer** for a specific record

```aws route53 test-dns-answer --hosted-zone-id [ZONE_ID] --record-name [www.example.com] --record-type [A]```

**List all health checks**

```aws route53 list-health-checks```

# SYNOPSIS

**aws route53** _subcommand_ [_options_]

# DESCRIPTION

**aws route53** is the AWS CLI interface for Amazon Route 53, a highly available and scalable Domain Name System (DNS) web service. It provides commands for domain registration, DNS routing configuration, and health checking of resources.

Route 53 connects user requests to infrastructure running in AWS (such as EC2 instances, Elastic Load Balancers, or S3 buckets) and can also route users to infrastructure outside of AWS. The service offers DNS failover, geolocation routing, latency-based routing, and weighted round-robin routing.

# SUBCOMMANDS

**Hosted Zones**
> create-hosted-zone, delete-hosted-zone, get-hosted-zone, list-hosted-zones, list-hosted-zones-by-name, list-hosted-zones-by-vpc, update-hosted-zone-comment

**Resource Records**
> change-resource-record-sets, list-resource-record-sets, test-dns-answer

**Health Checks**
> create-health-check, delete-health-check, get-health-check, get-health-check-status, list-health-checks, update-health-check

**Traffic Policies**
> create-traffic-policy, delete-traffic-policy, get-traffic-policy, list-traffic-policies, create-traffic-policy-instance, update-traffic-policy-instance

**DNSSEC**
> enable-hosted-zone-dnssec, disable-hosted-zone-dnssec, get-dnssec, create-key-signing-key, delete-key-signing-key

**VPC Association**
> associate-vpc-with-hosted-zone, disassociate-vpc-from-hosted-zone, list-vpc-association-authorizations

**Query Logging**
> create-query-logging-config, delete-query-logging-config, get-query-logging-config, list-query-logging-configs

# CAVEATS

DNS changes made via **change-resource-record-sets** are not instantaneous; propagation can take up to 60 seconds. Use **get-change** with the change ID to check propagation status. Hosted zone IDs must include the **/hostedzone/** prefix in some commands. Route 53 has API rate limits that may affect bulk operations.

# HISTORY

Amazon Route 53 was launched in **December 2010** as part of AWS's infrastructure services. The name is a reference to TCP/UDP port 53, where DNS server requests are addressed. The AWS CLI support for Route 53 was introduced with the AWS CLI tool and has been continuously expanded to support features like DNSSEC (2020), CIDR collections, and traffic policies.

# SEE ALSO

[aws](/man/aws)(1), [aws-s3](/man/aws-s3)(1), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1)
