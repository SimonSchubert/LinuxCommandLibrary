# TLDR

**Store a key-value pair**

```charm kv set [key] [value]```

**Retrieve a value**

```charm kv get [key]```

**List all keys**

```charm kv list```

**Delete a key**

```charm kv delete [key]```

**Encrypt a file**

```charm crypt encrypt [file]```

**Decrypt a file**

```charm crypt decrypt [file.enc]```

**Sync data to Charm Cloud**

```charm sync```

**Show account information**

```charm id```

# SYNOPSIS

**charm** _command_ [_options_] [_arguments_]

# PARAMETERS

**kv set** _key_ _value_
> Store a key-value pair.

**kv get** _key_
> Retrieve value for key.

**kv list**
> List all stored keys.

**kv delete** _key_
> Delete a key-value pair.

**crypt encrypt** _file_
> Encrypt a file.

**crypt decrypt** _file_
> Decrypt a file.

**sync**
> Synchronize with Charm Cloud.

**id**
> Show or manage account identity.

**link**
> Link a new device to account.

**backup-keys**
> Export encryption keys.

**fs**
> Access Charm file system.

**-o**, **--output** _file_
> Output file for operations.

# DESCRIPTION

**charm** is a command-line tool from Charmbracelet providing end-to-end encrypted cloud storage, key-value database, and file encryption. It enables syncing data securely across devices without managing your own server.

The **kv** commands provide a simple key-value store useful for configuration, secrets, and application state. All data is encrypted client-side before syncing to Charm Cloud, ensuring privacy.

File encryption via **charm crypt** uses your Charm keys to encrypt any file. The **fs** command provides a virtual file system stored in the cloud. Device linking allows accessing the same data from multiple machines.

# CAVEATS

Data is encrypted, but requires trusting Charm Cloud infrastructure. The free tier has storage limits. Key backup is essential - losing keys means losing access to data. Self-hosting is possible but requires more setup.

# HISTORY

Charm was created by **Charmbracelet**, a company focused on making the command line more delightful, founded in **2020**. Known for TUI libraries like Bubble Tea and Lip Gloss, they developed Charm Cloud as infrastructure for CLI tools needing cloud sync. The service launched to provide developers with easy, encrypted cloud storage without complex setup.

# SEE ALSO

[pass](/man/pass)(1), [age](/man/age)(1), [glow](/man/glow)(1)
