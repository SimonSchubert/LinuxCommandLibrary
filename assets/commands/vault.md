# TLDR

**Start the Vault server** in development mode

```vault server -dev```

**Login to Vault** with a token

```vault login [token]```

**Write a secret** to the key-value store

```vault kv put secret/[path] [key]=[value]```

**Read a secret**

```vault kv get secret/[path]```

**List secrets** at a path

```vault kv list secret/```

**Delete a secret**

```vault kv delete secret/[path]```

**Enable a secrets engine**

```vault secrets enable -path=[path] [engine]```

**Check Vault status**

```vault status```

# SYNOPSIS

**vault** [_global_options_] _command_ [_command_options_] [_arguments_]

# PARAMETERS

**login**
> Authenticate to Vault and obtain a token.

**kv put**
> Write secrets to the key-value secrets engine.

**kv get**
> Read secrets from the key-value secrets engine.

**kv delete**
> Delete secrets from the key-value secrets engine.

**kv list**
> List secret keys at a path.

**secrets enable**
> Enable a secrets engine at a path.

**secrets disable**
> Disable a secrets engine.

**auth enable**
> Enable an authentication method.

**operator init**
> Initialize a new Vault cluster.

**operator unseal**
> Unseal the Vault.

**operator seal**
> Seal the Vault.

**status**
> Print the current status of Vault.

**server**
> Start a Vault server.

**path-help** _path_
> Show help for a specific API path.

**-address** _url_
> Address of the Vault server.

**-token** _token_
> Vault token for authentication.

**-format** _format_
> Output format: table, json, yaml.

**-help**
> Display help for a command.

# DESCRIPTION

**Vault** by HashiCorp is a secrets management tool that securely stores and controls access to tokens, passwords, certificates, API keys, and other secrets. It provides encryption as a service, dynamic secrets generation, and detailed audit logging.

The CLI is a wrapper around the HTTP API and supports interactive and scripted use. Configuration can be set via environment variables: **VAULT_ADDR** for the server address and **VAULT_TOKEN** for authentication.

Vault uses a seal/unseal mechanism for security. After initialization, Vault is sealed and requires unseal keys to become operational. In dev mode (**vault server -dev**), Vault starts unsealed for testing.

# CAVEATS

The dev server stores data in memory and is not for production use. Unsealing requires a threshold of key shares; losing too many shares can make the Vault unrecoverable. Token management is critical for security; leaked tokens should be immediately revoked.

# HISTORY

Vault was created by **HashiCorp** and first released in **April 2015**. It was designed to address the challenge of managing secrets in modern infrastructure. Key features like dynamic secrets, leasing, and renewal were core from the beginning. Vault has grown to support numerous authentication methods and secrets engines, becoming a standard tool for secrets management in DevOps and cloud-native environments.

# SEE ALSO

[consul](/man/consul)(1), [terraform](/man/terraform)(1), [gpg](/man/gpg)(1), [pass](/man/pass)(1)
