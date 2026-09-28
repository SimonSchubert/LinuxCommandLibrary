# TAGLINE

Keycloak Admin CLI

# TLDR

**Log in** to a Keycloak server (prompts for the password)

```kcadm.sh config credentials --server [http://localhost:8080] --realm [master] --user [admin]```

Log in with a **service account** client secret

```kcadm.sh config credentials --server [url] --realm [master] --client [client_id] --secret [secret]```

**Create a realm**

```kcadm.sh create realms -s realm=[name] -s enabled=true```

**Create a user** and print its id

```kcadm.sh create users -r [realm] -s username=[user] -s enabled=true -i```

**Search users**, showing selected fields

```kcadm.sh get users -r [realm] -q username=[user] --fields id,username,email```

**Update a user**

```kcadm.sh update users/[id] -r [realm] -s email=[email]```

**Set a temporary password**

```kcadm.sh set-password -r [realm] --username [user] --new-password [pass] --temporary```

**Assign a realm role** to a user

```kcadm.sh add-roles -r [realm] --uusername [user] --rolename [role]```

**Create a client** from a JSON file

```kcadm.sh create clients -r [realm] -f [client.json]```

# SYNOPSIS

**kcadm.sh** _command_ [_endpoint_] [_options_]

# COMMANDS

**config credentials**
> Authenticate and store a session in the config file.

**config truststore**
> Configure a truststore for TLS connections.

**create** _ENDPOINT_
> Create a resource (realms, users, clients, groups, roles, ...).

**get** _ENDPOINT_
> Get one or more resources.

**update** _ENDPOINT_
> Update a resource.

**delete** _ENDPOINT_
> Delete a resource.

**get-roles**, **add-roles**, **remove-roles**
> List, add or remove realm or client roles of a user, group or composite role.

**set-password**
> Reset a user's password.

**help** [_command_]
> Show help for a command.

# PARAMETERS

**--server** _URL_
> Server URL to log in to (config credentials).

**--realm** _REALM_
> Realm to authenticate against.

**--user** _USER_, **--password** _PASS_
> Login username and password; the password is prompted for or read from **KC_CLI_PASSWORD** if omitted.

**--client** _ID_, **--secret** _SECRET_
> Client ID (default: admin-cli) and client secret for service account login.

**-r**, **--target-realm** _REALM_
> Realm to operate on, if different from the login realm.

**-s**, **--set** _NAME=VALUE_
> Set an attribute in the request body.

**-f**, **--file** _FILE_
> Read the JSON body from a file, or stdin with **-**.

**-q**, **--query** _NAME=VALUE_
> Add a query parameter to the request.

**-F**, **--fields** _FILTER_
> Output only the given JSON fields.

**--format** _FORMAT_
> Output format: json (default) or csv.

**-o**, **--offset** _N_, **-l**, **--limit** _N_
> Paging for get requests.

**-i**, **--id**
> Print only the id of a created resource.

**--config** _FILE_
> Config file (default: ~/.keycloak/kcadm.config).

**--no-config**
> Do not load or save a config file; authenticate per command.

**--insecure**
> Disable TLS certificate validation.

**-x**
> Print a full stack trace on error.

# DESCRIPTION

**kcadm.sh** is the Keycloak Admin CLI, shipped in the **bin** directory of the Keycloak server distribution (**kcadm.bat** on Windows). It is a thin client for the Keycloak Admin REST API: endpoints like **realms**, **users**, **clients** and **groups** map directly to REST paths.

After **config credentials** stores an access token in the config file, subsequent commands reuse the session until it expires. Attributes are set with **-s** or supplied as JSON with **-f**.

# CAVEATS

Requires Java and a running Keycloak server reachable over HTTP(S). Since Keycloak 17 (Quarkus), server URLs no longer include the **/auth** context path. Passing passwords on the command line exposes them in shell history; prefer the prompt or environment variables. The config file contains tokens and should be protected.

# HISTORY

kcadm.sh is the official admin CLI for **Keycloak**, the open-source identity and access management solution started by **Red Hat** in 2014.

# SEE ALSO

[keycloak](/man/keycloak)(1), [curl](/man/curl)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/keycloak/keycloak)```

```[Homepage](https://www.keycloak.org)```

```[Documentation](https://www.keycloak.org/docs/latest/server_admin/#admin-cli)```

<!-- verified: 2026-09-29 -->
