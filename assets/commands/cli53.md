# TLDR

**List all hosted zones**

```cli53 list```

**Export DNS records** for a domain in BIND format

```cli53 export [example.com]```

**Import DNS records** from a BIND zone file

```cli53 import --file [zone.txt] [example.com]```

**Create a new DNS record**

```cli53 rrcreate [example.com] '[www 300 A 192.0.2.1]'```

**Delete a DNS record**

```cli53 rrdelete [example.com] [www] [A]```

**Create a new hosted zone**

```cli53 create [example.com]```

**Purge all records** from a zone (keeping NS and SOA)

```cli53 rrpurge --confirm [example.com]```

# SYNOPSIS

**cli53** _command_ [_options_] [_arguments_]

# PARAMETERS

**list**
> List all hosted zones in the account.

**export** _ZONE_
> Export zone records in BIND format.

**import** _ZONE_
> Import records from a BIND zone file.

**rrcreate** _ZONE_ _RECORD_
> Create a resource record.

**rrdelete** _ZONE_ _NAME_ _TYPE_
> Delete a resource record.

**create** _ZONE_
> Create a new hosted zone.

**delete** _ZONE_
> Delete a hosted zone.

**rrpurge** _ZONE_
> Delete all records in a zone except NS and SOA.

**--file** _FILE_
> File containing zone records for import.

**--replace**
> Replace existing records during import.

**--wait**
> Wait for changes to propagate before returning.

**--confirm**
> Confirm destructive operations without prompting.

# DESCRIPTION

**cli53** is a command-line tool for managing Amazon Web Services Route 53 DNS service. It provides a straightforward interface for creating, modifying, exporting, and importing DNS records using familiar BIND zone file format.

The tool supports the full range of Route 53 record types including A, AAAA, CNAME, MX, TXT, SRV, and alias records. It can export entire zones to BIND format for backup or migration, and import records from zone files for bulk updates.

cli53 uses standard AWS credential handling, supporting environment variables, credential files, and IAM roles. It's particularly useful for infrastructure automation, disaster recovery preparation, and migrating DNS records between providers.

# CAVEATS

Requires AWS credentials with Route 53 permissions configured via environment variables or AWS credential files. The **rrpurge** command is destructive and cannot be undone. Zone IDs can be used instead of domain names for disambiguation when multiple zones exist for the same domain.

# HISTORY

cli53 was created as an open-source tool to simplify Route 53 management from the command line. Named after Route 53's port association (DNS uses port 53), it provides a more user-friendly alternative to AWS CLI's Route 53 commands, particularly for bulk operations using BIND zone file format.

# SEE ALSO

[aws](/man/aws)(1), [dig](/man/dig)(1), [named](/man/named)(8)
