# TAGLINE

Forward RSS feed items to email

# TLDR

**Initialize configuration**

```r2e new [email@example.com]```

**Add feed**

```r2e add [feed_name] [https://example.com/feed.xml]```

**Run (send emails)**

```r2e run```

**List feeds**

```r2e list```

**Delete feed**

```r2e delete [feed_name]```

# SYNOPSIS

**r2e** _command_ [_options_]

# COMMANDS

**new** _email_
> Initialize with default email.

**add** _name_ _url_
> Add feed.

**run**
> Process feeds and send.

**list**
> List feeds.

**delete** _name_
> Remove feed.

**reset** _name_
> Reset feed date.

**opmlimport** _file_
> Import OPML.

# DESCRIPTION

**rss2email** (r2e) converts RSS/Atom feeds to email. It checks feeds and sends new items to your email, allowing you to read feeds in your email client.

# EXAMPLES

```bash
# Initialize
r2e new user@example.com

# Add feeds
r2e add hackernews https://news.ycombinator.com/rss
r2e add lwn https://lwn.net/headlines/rss

# List feeds
r2e list

# Run manually
r2e run

# Reset feed (resend all)
r2e reset hackernews

# Import OPML
r2e opmlimport feeds.opml
```

# CONFIGURATION

```ini
# ~/.config/rss2email.cfg
[DEFAULT]
from = rss2email@example.com
to = user@example.com
smtp-server = localhost
```

# CRON

```bash
# Run every hour
0 * * * * r2e run
```

# CAVEATS

Requires working mail setup (SMTP or local). Stores state in ~/.local/share/rss2email/. Run periodically via cron.

# HISTORY

rss2email was created by **Aaron Swartz** in 2004, now maintained by the community.

# SEE ALSO

[fetchmail](/man/fetchmail)(1), [procmail](/man/procmail)(1), [mutt](/man/mutt)(1)
