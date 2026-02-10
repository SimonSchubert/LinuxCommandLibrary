# TAGLINE

unified CLI for OpenStack cloud services

# TLDR

**List servers**

```openstack server list```

**Create server**

```openstack server create --flavor [m1.small] --image [ubuntu] --network [net] [name]```

**List images**

```openstack image list```

**List flavors**

```openstack flavor list```

**Show server details**

```openstack server show [server_name]```

**Delete server**

```openstack server delete [server_name]```

# SYNOPSIS

**openstack** [_options_] _command_ [_args_]

# PARAMETERS

**server**
> Compute instance commands.

**image**
> Image commands.

**network**
> Network commands.

**volume**
> Block storage commands.

**flavor**
> Flavor commands.

**--os-cloud** _name_
> Use cloud config.

**-f** _format_
> Output format.

# DESCRIPTION

**openstack** is the unified CLI for OpenStack cloud services. It provides a single interface to manage compute, storage, networking, and identity services.

Configuration is typically in clouds.yaml or environment variables.

# CONFIGURATION

```yaml
# ~/.config/openstack/clouds.yaml
clouds:
  mycloud:
    auth:
      auth_url: https://cloud.example.com:5000
      username: user
      password: pass
      project_name: myproject
```

# COMMON COMMANDS

```bash
openstack server list
openstack image list
openstack network list
openstack volume list
openstack flavor list
```

# CAVEATS

Requires OpenStack credentials. API versions vary by deployment. Large operations may timeout.

# HISTORY

The unified OpenStack client was introduced to replace service-specific CLIs (nova, neutron, cinder), providing consistent interface across services.

# SEE ALSO

[nova](/man/nova)(1), [neutron](/man/neutron)(1), [cinder](/man/cinder)(1), [glance](/man/glance)(1)
