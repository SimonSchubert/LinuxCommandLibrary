# TLDR

**List domains**

```linode-cli domains list```

**Create domain**

```linode-cli domains create --domain [example.com] --type master --soa_email [admin@example.com]```

**View domain**

```linode-cli domains view [domain_id]```

**Delete domain**

```linode-cli domains delete [domain_id]```

**List domain records**

```linode-cli domains records-list [domain_id]```

# SYNOPSIS

**linode-cli domains** _command_ [_options_]

# PARAMETERS

**list**
> List all domains.

**create**
> Create domain.

**view** _id_
> View domain details.

**delete** _id_
> Delete domain.

**records-list** _id_
> List DNS records.

**records-create** _id_
> Create DNS record.

**--domain** _name_
> Domain name.

**--type** _type_
> Domain type (master, slave).

# DESCRIPTION

**linode-cli domains** manages DNS domains on Linode. Create, update, and delete domains and DNS records. Part of Linode CLI for cloud infrastructure management.

# SEE ALSO

[linode-cli](/man/linode-cli)(1)

