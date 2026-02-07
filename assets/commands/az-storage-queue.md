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

```az storage message put --queue-name [myqueue] --content [Hello World] --account-name [mystorageaccount]```

**Get messages** from a queue

```az storage message get --queue-name [myqueue] --account-name [mystorageaccount]```

**Peek at messages** without removing them

```az storage message peek --queue-name [myqueue] --account-name [mystorageaccount]```

**Delete a message** from a queue

```az storage message delete --queue-name [myqueue] --id [message-id] --pop-receipt [receipt] --account-name [mystorageaccount]```

# SYNOPSIS

**az** **storage** **queue** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a queue.

**delete**
> Delete a queue.

**list**
> List queues in a storage account.

**exists**
> Check if a queue exists.

**metadata show**
> Show queue metadata.

**metadata update**
> Update queue metadata.

**policy**
> Manage queue access policies.

# PARAMETERS

**--name** **-n**
> Name of the queue.

**--account-name**
> Storage account name.

**--account-key**
> Storage account key.

**--connection-string**
> Storage connection string.

# DESCRIPTION

**az storage queue** manages Azure Queue Storage, which provides cloud messaging between application components. Queues enable asynchronous communication and decoupled architectures.

Messages can be up to 64 KB in size and remain in the queue for up to 7 days by default.

# CAVEATS

Requires Azure CLI and valid storage credentials. Queue names must be lowercase. Message visibility timeout affects when messages become visible again after retrieval.

# SEE ALSO

[az-storage-table](/man/az-storage-table)(1), [az-storage-entity](/man/az-storage-entity)(1), [az](/man/az)(1)
