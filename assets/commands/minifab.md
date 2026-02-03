# TLDR

**Initialize Hyperledger Fabric network**

```minifab up```

**Bring down network**

```minifab down```

**Install chaincode**

```minifab install -n [chaincode_name]```

**Invoke chaincode**

```minifab invoke -n [chaincode_name] -p '"[function]","[arg1]","[arg2]"'```

# SYNOPSIS

**minifab** _command_ [_options_]

# PARAMETERS

**up**
> Start Fabric network.

**down**
> Stop and remove network.

**install**
> Install chaincode.

**invoke**
> Invoke chaincode function.

**query**
> Query chaincode.

**-n** _name_
> Chaincode name.

**-p** _params_
> Function parameters.

**-c** _channel_
> Channel name.

# DESCRIPTION

**minifab** simplifies Hyperledger Fabric network deployment. Creates development networks with minimal configuration. Automates chaincode lifecycle management.

# SEE ALSO

[peer](/man/peer)(1), [docker](/man/docker)(1)

