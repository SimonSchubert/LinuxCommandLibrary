# TAGLINE

Google Contacts command-line interface

# TLDR

Allow goobook to access Google contacts using **OAuth2**

```goobook authenticate```

**Dump** all contacts to XML (stdout)

```goobook dump_contacts```

# SYNOPSIS

**goobook** _command_ [_arguments_]

# PARAMETERS

**authenticate**
> Authenticate with Google and store OAuth2 credentials

**query** _QUERY_
> Search contacts matching query

**add**
> Add contact from email headers (stdin)

**dump_contacts**
> Export all contacts to XML format

**reload**
> Reload and cache contacts from Google

# DESCRIPTION

**goobook** provides command-line access to Google Contacts, designed primarily for integration with the mutt email client. It allows searching contacts for email address completion and adding new contacts from email headers.

For mutt integration, add to **.muttrc**:
```
set query_command="goobook query %s"
```

Configuration is stored in **~/.goobookrc** and includes Google API credentials obtained through the OAuth2 authentication flow.

# CONFIGURATION

**~/.goobookrc**
> Configuration file containing Google API credentials, OAuth2 tokens, and cache settings.

# CAVEATS

Requires Google API credentials and OAuth2 authentication. Google's API quotas may limit frequent queries. Contact changes may take time to sync. The Google Contacts API access requires proper OAuth scopes.

# HISTORY

goobook was created to bridge the gap between command-line email clients like mutt and Google's contact management. It provides a simple interface to Google Contacts that works well with Unix text-processing tools and email workflows.

# SEE ALSO

[mutt](/man/mutt)(1), [abook](/man/abook)(1)
