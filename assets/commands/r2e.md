# TAGLINE

Convert RSS feeds to email messages

# TLDR

**Convert RSS to email**

```r2e run```

**Add feed**

```r2e add [name] [url] [email]```

**List feeds**

```r2e list```

**Delete feed**

```r2e delete [name]```

**Create config**

```r2e new [email]```

# SYNOPSIS

**r2e** _command_ [_options_]

# PARAMETERS

**run**
> Process feeds.

**add** _NAME_ _URL_ _EMAIL_
> Add feed.

**list**
> List feeds.

**delete** _NAME_
> Remove feed.

**new** _EMAIL_
> Initialize config.

# DESCRIPTION

**r2e** (rss2email) monitors RSS and Atom feeds and delivers new entries as individual email messages to a specified address. It bridges the gap between web-based content syndication and email-based reading workflows, allowing users to follow blogs, news sites, and other feeds through their existing mail client.

The tool maintains state between runs to track which entries have already been sent, so each invocation of **r2e run** only delivers new items. Feeds are managed with **add**, **list**, and **delete** subcommands, and the initial configuration created by **r2e new** sets the default recipient address. It supports both SMTP delivery and local sendmail for dispatching messages.

# CAVEATS

Requires email setup. Python package.

# HISTORY

rss2email was created for **RSS to email** delivery.

# SEE ALSO

[feed2exec](/man/feed2exec)(1), [newsboat](/man/newsboat)(1)

