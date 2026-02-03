# TLDR

**List firewall rules**

```doctl databases firewalls list [cluster_id]```

**Add firewall rule for IP**

```doctl databases firewalls append [cluster_id] --rule ip_addr:[ip]```

**Add firewall rule for droplet**

```doctl databases firewalls append [cluster_id] --rule droplet:[droplet_id]```

**Remove firewall rule**

```doctl databases firewalls remove [cluster_id] [rule_uuid]```

# SYNOPSIS

**doctl** **databases** **firewalls** _command_ [_options_]

# SUBCOMMANDS

**list**
> List firewall rules.

**append**
> Add firewall rule.

**remove**
> Remove firewall rule.

# DESCRIPTION

**doctl databases firewalls** manages trusted sources (firewall rules) for DigitalOcean managed database clusters. Rules control which IPs, droplets, Kubernetes clusters, or tags can connect.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-compute-firewall](/man/doctl-compute-firewall)(1)

