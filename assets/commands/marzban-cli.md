# TAGLINE

CLI for Marzban proxy panel administration

# TLDR

**List** all administrators

```marzban cli admin list```

**Create** a new administrator

```marzban cli admin create -u [username]```

**List** all users

```marzban cli user list```

**Transfer** ownership of a user to another administrator

```marzban cli user set-owner -u [username] --owner [owner]```

Generate a **subscription config** for a user

```marzban cli subscription get-config -u [username] -f [v2ray|clash]```

Display a user's **subscription link**

```marzban cli subscription get-link -u [username]```

Display **help**

```marzban cli --help```

# SYNOPSIS

**marzban cli** [_OPTIONS_] _COMMAND_ [_ARGS_]...

# PARAMETERS

**admin**
> Manage panel administrators (`create`, `delete`, `list`, `update`, `import-from-env`)

**user**
> Manage users (`list`, `set-owner`)

**subscription**
> Subscription helpers (`get-config`, `get-link`)

**completion**
> Generate or install shell completion scripts

**admin create** **-u** _username_
> Create an admin; optional `--sudo`, `-tg`/`--telegram-id`, `-dc`/`--discord-webhook`

**user list**
> List users; filter with `-u`, `-s`/`--search`, `--status`, `--admin`/`--owner`

**subscription get-config** **-u** _username_ **-f** {_v2ray_|_clash_}
> Generate subscription config; optional `-o`/`--output` and `--base64`

**subscription get-link** **-u** _username_
> Print subscription URL (requires `XRAY_SUBSCRIPTION_URL_PREFIX`)

# DESCRIPTION

**marzban cli** is the command-line interface for [Marzban](https://github.com/Gozargah/Marzban), an open-source proxy management panel built around Xray. It manages administrators, users, and subscription payloads without using the web UI.

Admin passwords can be supplied non-interactively via `MARZBAN_ADMIN_PASSWORD`. `admin import-from-env` creates a sudo admin from `SUDO_USERNAME`/`SUDO_PASSWORD` and attaches unowned users to it.

# CAVEATS

Requires a working Marzban installation and database access (typically run on the panel host). `subscription get-link` needs `XRAY_SUBSCRIPTION_URL_PREFIX` set correctly. `admin update` is interactive only.

# HISTORY

Part of **Marzban**, a Python-based multi-protocol proxy panel by Gozargah.

# SEE ALSO

[curl](/man/curl)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/Gozargah/Marzban)```

```[Documentation](https://github.com/Gozargah/Marzban/blob/master/cli/README.md)```

<!-- verified: 2026-07-28 -->
