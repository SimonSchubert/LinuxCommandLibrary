# TAGLINE

Fetch info about a Telegram username or URL

# TLDR

**Get info about a Telegram username**

```tginfo [username]```

**Get info from a Telegram URL**

```tginfo https://t.me/[username]```

**Display only specific attributes**

```tginfo [username] --attrs=title,type,subscribers```

**Get info from an invite link**

```tginfo https://t.me/+[invite_code]```

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

**tginfo** is a zero-dependency Node.js module that fetches information about a Telegram username or URL. It accepts web URLs (https://t.me/username, https://t.me/+invite_code), deep links (tg://resolve?domain=username), plain usernames (with or without @), or invite codes. It works by fetching and parsing the public Telegram web page, not through the Telegram API.

Available attributes are type, webUrl, tgUrl, username, title, image, info, verified, previewUrl, subscribers, members, online, and error. Which ones are present depends on the entity type (user, bot, channel, or group).

# CAVEATS

Requires Node.js 16 or newer. Install globally via `npm install -g tginfo` or run with `npx tginfo`. It cannot resolve links to messages in private channels or groups, phone numbers, or links containing a numeric identifier.

# SEE ALSO

[npx](/man/npx)(1), [npm](/man/npm)(1)
