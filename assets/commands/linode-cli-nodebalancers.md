# TAGLINE

manages Linode NodeBalancers

# TLDR

**List node balancers**

```linode-cli nodebalancers list```

**Create node balancer**

```linode-cli nodebalancers create --region [us-east] --label [my-balancer]```

**View node balancer**

```linode-cli nodebalancers view [nodebalancer_id]```

**Add a port configuration** (e.g. HTTP on port 80)

```linode-cli nodebalancers config-create [nodebalancer_id] --port [80] --protocol [http] --algorithm [roundrobin] --check [http] --check_path [/]```

**List configs**

```linode-cli nodebalancers configs-list [nodebalancer_id]```

**Add a backend node**

```linode-cli nodebalancers node-create [nodebalancer_id] [config_id] --address [192.168.1.1:80] --label [web1]```

**List backend nodes** and their health status

```linode-cli nodebalancers nodes-list [nodebalancer_id] [config_id]```

**Delete node balancer**

```linode-cli nodebalancers delete [nodebalancer_id]```

# SYNOPSIS

**linode-cli nodebalancers** _action_ [_ids_] [_options_]

# PARAMETERS

**list**, **ls**
> List all NodeBalancers.

**create**
> Create a NodeBalancer (**--region** is required).

**view** _ID_
> View NodeBalancer details.

**update** _ID_
> Update a NodeBalancer (label, tags, client_conn_throttle).

**delete**, **rm** _ID_
> Delete a NodeBalancer.

**types**
> List NodeBalancer types and pricing.

**firewalls** _ID_
> Update the firewalls assigned to a NodeBalancer.

**configs-list** _ID_
> List port configurations.

**config-create** _ID_
> Create a port configuration.

**config-view**, **config-update**, **config-delete** _ID_ _CONFIG_ID_
> View, update or delete a configuration.

**config-rebuild** _ID_ _CONFIG_ID_
> Replace a configuration and its full set of nodes in one call.

**nodes-list** _ID_ _CONFIG_ID_
> List backend nodes of a configuration.

**node-create** _ID_ _CONFIG_ID_
> Add a backend node.

**node-view**, **node-update**, **node-delete** _ID_ _CONFIG_ID_ _NODE_ID_
> View, update or delete a backend node.

**vpcs-list**, **vpc-view** _ID_
> Show VPC configurations of a NodeBalancer.

**--region** _REGION_
> Datacenter region.

**--label** _NAME_
> NodeBalancer, or node, label.

**--tags** _TAG_
> Tag to apply; repeat for several.

**--client_conn_throttle** _N_
> Throttle new connections per second per client IP (0 disables).

**--firewall_id** _ID_
> Firewall to assign at creation.

**--port** _PORT_
> Port the configuration listens on.

**--protocol** _PROTO_
> **http**, **https**, **tcp** or **udp**.

**--algorithm** _ALG_
> Balancing algorithm: **roundrobin**, **leastconn** or **source** (UDP also supports **ring_hash**).

**--stickiness** _MODE_
> Session stickiness: **none**, **table**, **http_cookie** (UDP: **session**, **source_ip**).

**--check** _TYPE_
> Active health check: **none**, **connection**, **http** or **http_body**.

**--check_path** _PATH_
> URL path used by HTTP health checks.

**--ssl_cert**, **--ssl_key** _PEM_
> Certificate and private key for HTTPS configurations.

**--address** _IP:PORT_
> Backend node address (private IPv4, public IPv6 or VPC IPv4 plus port).

**--mode** _MODE_
> Node mode: **accept**, **reject**, **drain** or **backup**.

**--weight** _N_
> Node weight (1-255).

**--help**
> Display help information for an action.

# DESCRIPTION

**linode-cli nodebalancers** manages Linode (Akamai Cloud) NodeBalancers, managed load balancers that distribute incoming traffic across backend Linodes.

Each NodeBalancer has one or more **configs**, one per listening port, which define the protocol, algorithm, session stickiness, TLS termination and health checks. Each config has its own set of backend **nodes**. Run **linode-cli nodebalancers** _action_ **--help** to see every argument for an action.

# CAVEATS

Requires a configured API token (**linode-cli configure** or **LINODE_CLI_TOKEN**). NodeBalancers are billed hourly up to a monthly cap. Backend nodes should use private IPs in the same region. Available flags are generated from the Linode API specification and change with CLI updates.

# HISTORY

linode-cli nodebalancers is part of the **Linode CLI**, a Python tool generated from the Linode API v4 OpenAPI specification. Linode was acquired by **Akamai** in **2022** and the service is now branded Akamai Cloud.

# INSTALL

```brew: brew install linode-cli```

```nix: nix profile install nixpkgs#linode-cli```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [linode-cli-linodes](/man/linode-cli-linodes)(1)

# RESOURCES

```[Source code](https://github.com/linode/linode-cli)```

```[Documentation](https://techdocs.akamai.com/cloud-computing/docs/nodebalancer)```

<!-- verified: 2026-09-29 -->
