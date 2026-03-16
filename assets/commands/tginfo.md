# TAGLINE

Fetch info about a Telegram username or URL

# TLDR

**Get info about a Telegram username**

```tginfo [username]```

**Get info from a Telegram URL**

```tginfo https://t.me/[username]```

**Display only specific attributes**

```tginfo [username] --attrs=title,type,subscribers```

**Output as JSON**

```tginfo [username] --json```

# SYNOPSIS

**tginfo** _slug/url_ [_options_]

# PARAMETERS

**--attrs**=_ATTR1,ATTR2_
> Display only specific attributes.

**--json**
> Display JSON instead of a human readable view.

**--help**
> Print help message.

**--version**
> Display version.

# DESCRIPTION

**tginfo** is a zero-dependency Node.js module that fetches information about a Telegram username or URL. It accepts web URLs (https://t.me/username), deep links (tg://resolve?domain=username), plain usernames, or invite codes.

The output includes attributes such as type, title, webUrl, tgUrl, and optional fields like username, info, verified, image, subscribers, members, and online count depending on the entity type.

# CAVEATS

Requires Node.js. Install globally via `npm install -g tginfo` or run with `npx tginfo`.

# SEE ALSO

[npx](/man/npx)(1), [npm](/man/npm)(1)
