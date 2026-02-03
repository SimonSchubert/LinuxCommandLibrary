# TLDR

**Create a Cognitive Services account**

```az cognitiveservices account create --name [myaccount] --resource-group [myRG] --kind [TextAnalytics] --sku [S1] --location [eastus]```

**List all Cognitive Services accounts**

```az cognitiveservices account list```

**Show account details**

```az cognitiveservices account show --name [myaccount] --resource-group [myRG]```

**List API access keys**

```az cognitiveservices account keys list --name [myaccount] --resource-group [myRG]```

**Regenerate an API key**

```az cognitiveservices account keys regenerate --name [myaccount] --resource-group [myRG] --key-name [key1]```

**List available account kinds**

```az cognitiveservices account list-kinds```

**Delete an account**

```az cognitiveservices account delete --name [myaccount] --resource-group [myRG]```

# SYNOPSIS

**az** **cognitiveservices** **account** _subcommand_ [_options_]

# SUBCOMMANDS

**account create**
> Create a Cognitive Services account.

**account delete**
> Delete a Cognitive Services account.

**account list**
> List all Cognitive Services accounts.

**account show**
> Show details of a specific account.

**account keys list**
> List account access keys.

**account keys regenerate**
> Regenerate account keys.

**account deployment**
> Manage model deployments.

**account commitment-plan**
> Manage commitment plans.

**account network-rule**
> Manage network rules.

# DESCRIPTION

**az cognitiveservices** manages Azure Cognitive Services accounts, which provide AI capabilities including vision, speech, language, and decision APIs. It handles account creation, configuration, deployments, and subscription management for services like Text Analytics, Computer Vision, Speech Services, and OpenAI.

# CAVEATS

Requires Azure CLI to be installed and authenticated with **az login**. Different service kinds have different SKU availability and pricing. Some services require accepting responsible AI terms before creation.

# SEE ALSO

[az](/man/az)(1), [az-config](/man/az-config)(1)
