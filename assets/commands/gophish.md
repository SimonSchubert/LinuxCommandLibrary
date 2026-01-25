# TLDR

**Start Gophish server**

```./gophish```

**Start with custom config**

```./gophish -config [config.json]```

**Access admin panel**

```https://localhost:3333```

# SYNOPSIS

**gophish** [_options_]

# PARAMETERS

**-config** _file_
> Configuration file path.

# DESCRIPTION

**Gophish** is an open-source phishing framework for security awareness training and penetration testing. It provides a web interface for creating and managing phishing campaigns.

The platform enables creating email templates, landing pages, and tracking user interactions. It's used by security teams to test organizational awareness and response to phishing attacks.

# FEATURES

- Email template editor with tracking
- Landing page cloning
- Campaign management
- Results dashboard with statistics
- User group management
- API for automation

# DEFAULT CREDENTIALS

```
Admin Panel: https://localhost:3333
Username: admin
Password: (shown on first run)
```

# CAVEATS

For authorized security testing only. Requires proper authorization before use. Email sending needs configured SMTP. May be flagged by security software. Store credentials securely.

# HISTORY

Gophish was created by **Jordan Wright** in **2015** as an open-source alternative to commercial phishing simulation platforms. It's widely used in security awareness training and penetration testing.

# SEE ALSO

[setoolkit](/man/setoolkit)(1), [king-phisher](/man/king-phisher)(1)
