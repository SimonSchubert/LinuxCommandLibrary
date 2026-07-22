# TAGLINE

Manage Azure Table Storage tables

# TLDR

**Create a table**

```az storage table create --name [mytable] --account-name [mystorageaccount]```

**List all tables**

```az storage table list --account-name [mystorageaccount]```

**Delete a table**

```az storage table delete --name [mytable] --account-name [mystorageaccount]```

**Check if table exists**

```az storage table exists --name [mytable] --account-name [mystorageaccount]```

**Generate a SAS token** for a table

```az storage table generate-sas --name [mytable] --permissions [raud] --expiry [2026-12-31T00:00Z] --account-name [mystorageaccount]```

**List stored access policies** for a table

```az storage table policy list --table-name [mytable] --account-name [mystorageaccount]```

# SYNOPSIS

**az** **storage** **table** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a table.

**delete**
> Delete a table.

**list**
> List tables in a storage account.

**exists**
> Check if a table exists.

**generate-sas**
> Generate a shared access signature for a table.

**policy create / delete / list / show / update**
> Manage stored access policies for a table.

**stats**
> Retrieve replication statistics for the Table service (requires RA-GRS).

# PARAMETERS

**--name** **-n**
> Name of the table.

**--account-name**
> Storage account name.

**--account-key**
> Storage account key. Env: AZURE_STORAGE_KEY.

**--auth-mode** _value_
> Authentication mode: key (legacy account key) or login (Azure AD credentials).

**--permissions**
> SAS permissions for generate-sas: (r)ead/query, (a)dd, (u)pdate, (d)elete. Combinable, for example raud.

**--start-pk** / **--end-pk** / **--start-rk** / **--end-rk**
> Restrict a table SAS to a partition-key and row-key range.

# DESCRIPTION

**az storage table** manages Azure Table Storage tables. Table Storage is a NoSQL key-value store suitable for storing structured, non-relational data. Tables contain entities (rows) with properties (columns).

Use **az storage entity** commands to manage the data within tables.

# CAVEATS

Requires Azure CLI and valid storage credentials. Table names must follow Azure naming conventions. Tables cannot be renamed; must delete and recreate.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [azure-cli](/man/azure-cli)(1), [az-storage](/man/az-storage)(1), [az-storage-entity](/man/az-storage-entity)(1), [az-storage-queue](/man/az-storage-queue)(1), [az-storage-account](/man/az-storage-account)(1)

# RESOURCES

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/storage/table)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

```[Source code](https://github.com/Azure/azure-cli)```

<!-- verified: 2026-06-19 -->
