# TAGLINE

Interact with Sigstore transparency log

# TLDR

**Upload entry**

```rekor-cli upload --artifact [file] --signature [file.sig] --public-key [key.pub]```

**Search by artifact**

```rekor-cli search --artifact [file]```

**Search by email**

```rekor-cli search --email [user@example.com]```

**Get entry by UUID**

```rekor-cli get --uuid [entry-uuid]```

**Get entry by log index**

```rekor-cli get --log-index [12345]```

**Verify entry**

```rekor-cli verify --artifact [file] --signature [file.sig]```

**Show log info**

```rekor-cli loginfo```

# SYNOPSIS

**rekor-cli** _command_ [_--artifact file_] [_--signature file_] [_options_]

# PARAMETERS

**upload**
> Add entry to log.

**search**
> Search entries.

**get**
> Retrieve entry.

**verify**
> Verify artifact.

**loginfo**
> Log information.

**--artifact** _FILE_
> Artifact file.

**--signature** _FILE_
> Signature file.

**--public-key** _FILE_
> Public key file.

**--uuid** _UUID_
> Entry UUID.

**--rekor_server** _URL_
> Rekor server URL.

# DESCRIPTION

**rekor-cli** interacts with Rekor transparency log. Rekor provides tamper-resistant audit trails.

Upload adds signed artifacts to the log. Entries are immutable once recorded.

Search finds entries by artifact, email, or hash. Proves when signatures were created.

Verification checks artifacts against the log. Confirms signature validity and timing.

Log info shows tree size and root hash. Enables verification of log integrity.

# CONFIGURATION

**REKOR_REKOR_SERVER**
> Environment variable to set the default Rekor server URL, overriding the built-in public instance at rekor.sigstore.dev.

# CAVEATS

Requires network access to Rekor server. Entries are public. Key management separate.

# HISTORY

**Rekor** is part of the **Sigstore** project, initiated by **Google**, **Red Hat**, and others. It provides transparency logging for software supply chain security.

# SEE ALSO

[cosign](/man/cosign)(1), [fulcio](/man/fulcio)(1), [sigstore](/man/sigstore)(1)
