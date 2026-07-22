# TAGLINE

Manage Azure Queue Storage and messages

# TLDR

**Create a queue**

```az storage queue create --name [myqueue] --account-name [mystorageaccount]```

**List all queues**

```az storage queue list --account-name [mystorageaccount]```

**Delete a queue**

```az storage queue delete --name [myqueue] --account-name [mystorageaccount]```

**Add a message** to a queue

```az storage message put -q [myqueue] --content [Hello World] --account-name [mystorageaccount]```

**Get (dequeue) messages**, hiding them for a visibility timeout

```az storage message get -q [myqueue] --num-messages [5] --visibility-timeout [30] --account-name [mystorageaccount]```

**Peek at messages** without removing or hiding them

```az storage message peek -q [myqueue] --num-messages [5] --account-name [mystorageaccount]```

**Delete a message** from a queue

```az storage message delete --id [message-id] --pop-receipt [receipt] -q [myqueue] --account-name [mystorageaccount]```

# SYNOPSIS

**az** **storage** **queue** _subcommand_ [_options_]

**az** **storage** **message** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a queue under the given account.

**delete**
> Delete a queue and any messages it contains.

**list**
> List queues in a storage account.

**exists**
> Return a boolean indicating whether the queue exists.

**generate-sas**
> Generate a shared access signature for the queue.

**stats**
> Retrieve replication statistics for the Queue service (requires RA-GRS).

**metadata show**
> Return all user-defined metadata for the queue.

**metadata update**
> Set user-defined metadata on the queue.

**policy create / delete / list / show / update**
> Manage stored access policies for the queue.

**message put / get / peek / delete / update / clear**
> Manage queue messages. These live under **az storage message**, not **az storage queue**.

# PARAMETERS

**--name** **-n**
> Name of the queue (for queue subcommands).

**--queue-name** **-q**
> Name of the queue (for **az storage message** subcommands).

**--account-name**
> Storage account name. Env: AZURE_STORAGE_ACCOUNT.

**--account-key**
> Storage account key. Env: AZURE_STORAGE_KEY.

**--connection-string**
> Storage connection string. Env: AZURE_STORAGE_CONNECTION_STRING.

**--auth-mode** _value_
> Authentication mode: key (legacy account key) or login (Azure AD credentials).

**--content**
> Message content for **message put** and **message update**, up to 64 KB.

**--visibility-timeout** _seconds_
> Hide a retrieved message from other consumers for this many seconds (1 second to 7 days).

**--time-to-live** _seconds_
> Lifetime of a message for **message put**. Use -1 for infinity. Default 7 days.

**--num-messages** _value_
> Number of messages to get or peek, up to 32. Default 1.

# DESCRIPTION

**az storage queue** manages Azure Queue Storage, which provides cloud messaging between application components. Queues enable asynchronous communication and decoupled architectures.

Messages can be up to 64 KB in size and have a default time-to-live of 7 days. Individual messages are managed with the **az storage message** command group (put, get, peek, delete, update, clear).

# CAVEATS

The **az storage queue** and **az storage message** groups are in preview. Requires Azure CLI and valid storage credentials (account key, connection string, SAS token, or `--auth-mode login`). Queue names must be 3-63 characters, lowercase letters, numbers, and hyphens. After a **get**, a message is hidden for the visibility timeout; if not deleted before it elapses the message reappears, so consumers must delete with the returned message id and pop receipt.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [azure-cli](/man/azure-cli)(1), [az-storage](/man/az-storage)(1), [az-storage-table](/man/az-storage-table)(1), [az-storage-account](/man/az-storage-account)(1)

# RESOURCES

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/storage/queue)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

```[Source code](https://github.com/Azure/azure-cli)```

<!-- verified: 2026-06-19 -->
