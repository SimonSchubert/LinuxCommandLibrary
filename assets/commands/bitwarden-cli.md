# TAGLINE

Manage passwords and secrets from the terminal

# TLDR

**Log in to Bitwarden**

```bw login [email]```

**Unlock the vault**

```bw unlock```

**List all items**

```bw list items```

**Search for a password**

```bw list items --search [query]```

**Get a specific item** by ID

```bw get item [item_id]```

**Get password for an item**

```bw get password [item_id]```

**Create a new login item**

```echo '[json]' | bw create item```

**Generate a password**

```bw generate -ulns --length [20]```

**Sync the vault**

```bw sync```

# SYNOPSIS

**bw** _command_ [_options_]

# PARAMETERS

**login** [_email_]
> Authenticate with Bitwarden server.

**unlock**
> Unlock the vault with master password.

**lock**
> Lock the vault.

**sync**
> Synchronize with the Bitwarden server.

**list** _object_
> List items (items, folders, collections, organizations, org-members, org-collections, send).

**get** _object_ _id_
> Get a specific object (item, password, username, uri, totp, notes, exposed, attachment, folder, template).

**create** _object_
> Create a new item (item, folder, attachment, org-collection); accepts base64-encoded JSON.

**edit** _object_ _id_
> Edit an existing item (item, folder, org-collection).

**delete** _object_ _id_
> Delete an item. Use **--permanent** to bypass the trash.

**restore** _object_ _id_
> Restore an item from the trash.

**import** _format_ _path_
> Import data from a third-party format or JSON export.

**export**
> Export the vault. Options: **--format** json|csv|encrypted_json, **--output** _path_.

**generate**
> Generate a password or passphrase.

**encode**
> Base64-encode stdin (commonly used to pipe JSON into create/edit).

**status**
> Show status (server URL, last sync, email, vault state) as JSON.

**serve**
> Start a local REST API server (**--port**, **--hostname**).

**config** _setting_ _value_
> Configure CLI settings (e.g. `bw config server <url>`).

**--session** _key_
> Session key from unlock (or set BW_SESSION env var).

**--search** _query_
> Search filter for list commands.

**--pretty**
> Pretty-print JSON output.

**--raw**
> Output raw value instead of JSON.

**--nointeraction**
> Do not prompt for input (for scripts).

**-u**, **-l**, **-n**, **-s**
> Password generation: uppercase, lowercase, numbers, special.

**--length** _n_
> Password length for generation (minimum 5).

**--passphrase**
> Generate a passphrase instead of a password (use with **--words**, **--separator**, **--capitalize**).

# DESCRIPTION

**bw** is the official command-line interface for Bitwarden, an open-source password manager. It provides full access to your encrypted vault from the terminal, enabling password retrieval, item management, and integration with scripts and automation.

After login, the vault must be unlocked with your master password. This returns a session key that must be provided to subsequent commands via **--session** or the **BW_SESSION** environment variable. The vault locks automatically after a timeout.

Items are represented as JSON, making the CLI suitable for scripting and integration with other tools. The generate command creates secure passwords without storing them.

# CAVEATS

The session key provides full access to your vault; protect it accordingly. Commands output JSON by default, which may require parsing with jq. The vault must be unlocked before most operations. API rate limits may apply to self-hosted instances.

# HISTORY

Bitwarden was founded by **Kyle Spearrin** and launched in **2016** as an open-source alternative to proprietary password managers. The CLI was introduced to complement the web, desktop, and mobile applications. Bitwarden has grown to become one of the most popular password managers, valued for its transparent open-source model and affordable pricing.

# SEE ALSO

[pass](/man/pass)(1), [gopass](/man/gopass)(1), [keepassxc-cli](/man/keepassxc-cli)(1), [1password](/man/1password)(1)
