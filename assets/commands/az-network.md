# TAGLINE

Manage Azure networking resources

# TLDR

**Create a DNS zone**

```az network dns zone create -g [resource-group] --name [example.com]```

**Add an A record** to a DNS zone

```az network dns record-set a add-record -g [resource-group] --zone-name [example.com] --record-set-name [www] --ipv4-address [1.2.3.4]```

**Create an application security group**

```az network asg create -g [resource-group] --name [myASG]```

**Create an application gateway**

```az network application-gateway create --name [myAppGateway] -g [resource-group] --sku [Standard_v2]```

**List all network resources** in a resource group

```az network vnet list -g [resource-group]```

**Create a virtual network**

```az network vnet create -g [resource-group] --name [myVNet] --address-prefix [10.0.0.0/16]```

**Create a network security group**

```az network nsg create -g [resource-group] --name [myNSG]```

# SYNOPSIS

**az network** _subcommand_ [_options_]

# DESCRIPTION

**az network** manages Azure Network resources including virtual networks, DNS zones, load balancers, application gateways, VPN gateways, ExpressRoute circuits, and network security groups.

Azure networking provides the foundation for cloud infrastructure, enabling secure connectivity between Azure resources, on-premises environments, and the internet.

# SUBCOMMANDS

**Virtual Networks**
> vnet create, vnet delete, vnet list, vnet show, vnet subnet

**DNS**
> dns zone create, dns zone list, dns record-set a, dns record-set cname, dns record-set mx

**Load Balancers**
> lb create, lb delete, lb list, lb rule, lb probe, cross-region-lb

**Application Gateway**
> application-gateway create, application-gateway delete, application-gateway start, application-gateway stop

**Security**
> nsg create, nsg rule, asg create, ddos-protection

**Connectivity**
> express-route, vpn-gateway, bastion, nat gateway, public-ip

# CAVEATS

Many network resources have dependencies; for example, deleting a virtual network requires removing all associated subnets and connected resources first. DNS record changes may take time to propagate globally. Application gateways incur charges even when stopped; delete unused gateways.

# HISTORY

Azure Virtual Network was one of the earliest Azure services, launching with Azure's general availability in **2010**. The networking capabilities have expanded significantly to include Azure DNS (2015), Application Gateway, ExpressRoute, and advanced security features.

# SEE ALSO

[az](/man/az)(1), [az-vm](/man/az-vm)(1), [az-aks](/man/az-aks)(1)
