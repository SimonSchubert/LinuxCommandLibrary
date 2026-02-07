# TAGLINE

Manage Virtual Private Cloud networks, subnets, and gateways.

# TLDR

**List all VPCs**

```aws ec2 describe-vpcs```

**Create a VPC**

```aws ec2 create-vpc --cidr-block [10.0.0.0/16]```

**List subnets**

```aws ec2 describe-subnets --filters Name=vpc-id,Values=[vpc-xxxxxxxx]```

**Create a subnet**

```aws ec2 create-subnet --vpc-id [vpc-xxxxxxxx] --cidr-block [10.0.1.0/24] --availability-zone [us-east-1a]```

**Create an internet gateway**

```aws ec2 create-internet-gateway```

**Attach internet gateway** to VPC

```aws ec2 attach-internet-gateway --vpc-id [vpc-xxxxxxxx] --internet-gateway-id [igw-xxxxxxxx]```

**List route tables**

```aws ec2 describe-route-tables --filters Name=vpc-id,Values=[vpc-xxxxxxxx]```

**Add a route** to internet gateway

```aws ec2 create-route --route-table-id [rtb-xxxxxxxx] --destination-cidr-block 0.0.0.0/0 --gateway-id [igw-xxxxxxxx]```

# SYNOPSIS

**aws ec2** _vpc-subcommand_ [_options_]

# DESCRIPTION

**aws-vpc** refers to VPC (Virtual Private Cloud) commands within the AWS CLI ec2 namespace. VPC provides isolated virtual networks in AWS where you launch resources with complete control over IP addressing, subnets, routing, and security.

Key components include **VPCs** (the network container), **subnets** (IP address ranges in availability zones), **route tables** (traffic routing rules), **internet gateways** (public internet access), **NAT gateways** (outbound-only internet for private subnets), and **security groups** (instance firewalls).

VPC Peering connects VPCs privately. Transit Gateway connects multiple VPCs and on-premises networks at scale. VPC Endpoints provide private access to AWS services without internet traversal.

# PARAMETERS

**describe-vpcs**
> List VPCs and their details.

**create-vpc**
> Create a new VPC.

**delete-vpc**
> Remove a VPC (must be empty).

**describe-subnets**
> List subnets.

**create-subnet**
> Create a subnet in a VPC.

**delete-subnet**
> Remove a subnet.

**describe-internet-gateways**
> List internet gateways.

**create-internet-gateway**
> Create an internet gateway.

**attach-internet-gateway**
> Attach gateway to VPC.

**describe-route-tables**
> List route tables.

**create-route**
> Add a route to a table.

**describe-nat-gateways**
> List NAT gateways.

**create-nat-gateway**
> Create a NAT gateway.

**--vpc-id** _id_
> VPC identifier.

**--cidr-block** _cidr_
> IP address range in CIDR notation.

**--subnet-id** _id_
> Subnet identifier.

**--availability-zone** _az_
> Availability zone for subnet.

**--filters** _filters_
> Filter results by attributes.

# CAVEATS

VPC CIDR blocks cannot overlap with peered VPCs. Each subnet exists in one availability zone. Public subnets need route to internet gateway and public IPs enabled. NAT gateways incur hourly and data charges. Default VPC has different behavior than custom VPCs. Security group rules are stateful; network ACLs are stateless.

# HISTORY

**Amazon VPC** launched in **August 2009** as one of AWS's foundational networking services, allowing customers to define isolated networks. Initially, EC2 ran in a shared network (EC2-Classic), but VPC became the default for new accounts in **2013**. **VPC Peering** added in **2014**. **NAT Gateway** as a managed service launched in **2015**. **Transit Gateway** introduced at **re:Invent 2018** for hub-and-spoke architectures. EC2-Classic was fully retired in **2022**.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1), [ip](/man/ip)(1), [aws-directconnect](/man/aws-directconnect)(1)
