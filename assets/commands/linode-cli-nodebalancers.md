# TAGLINE

manages Linode NodeBalancers

# TLDR

**List node balancers**

```linode-cli nodebalancers list```

**Create node balancer**

```linode-cli nodebalancers create --region [us-east] --label [my-balancer]```

**View node balancer**

```linode-cli nodebalancers view [nodebalancer_id]```

**List configs**

```linode-cli nodebalancers configs-list [nodebalancer_id]```

**Delete node balancer**

```linode-cli nodebalancers delete [nodebalancer_id]```

**Add node**

```linode-cli nodebalancers node-create [nodebalancer_id] [config_id] --address [192.168.1.1:80]```

# SYNOPSIS

**linode-cli nodebalancers** _subcommand_ [_options_]

# PARAMETERS

_SUBCOMMAND_
> NodeBalancer operation.

**list**
> List all NodeBalancers.

**create**
> Create NodeBalancer.

**view** _ID_
> View NodeBalancer details.

**configs-list** _ID_
> List configurations.

**delete** _ID_
> Delete NodeBalancer.

**--region** _REGION_
> Datacenter region.

**--label** _NAME_
> NodeBalancer name.

**--help**
> Display help information.

# DESCRIPTION

**linode-cli nodebalancers** manages Linode NodeBalancers. NodeBalancers distribute traffic across instances.

The tool configures load balancing, health checks, and SSL termination for high availability.

# CAVEATS

Requires authentication. Billed hourly. Needs backend nodes configured.

# HISTORY

linode-cli nodebalancers is part of the **Linode CLI** for managing NodeBalancer load balancing services.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [linode-cli-linodes](/man/linode-cli-linodes)(1)

