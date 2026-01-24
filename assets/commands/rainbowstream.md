# TLDR

**Start rainbowstream**

```rainbowstream```

**Post tweet**

```t [message]```

**View timeline**

```home```

**Reply to tweet**

```rep [tweet_id] [message]```

**Retweet**

```rt [tweet_id]```

**Like tweet**

```fav [tweet_id]```

**Search tweets**

```s [query]```

**View mentions**

```mentions```

# SYNOPSIS

**rainbowstream** [_options_]

# INTERACTIVE COMMANDS

**t** _MESSAGE_
> Post tweet.

**home**
> Show home timeline.

**mentions**
> Show mentions.

**me**
> Show own tweets.

**rep** _ID_ _MESSAGE_
> Reply to tweet.

**rt** _ID_
> Retweet.

**fav** _ID_
> Like tweet.

**s** _QUERY_
> Search tweets.

**whois** _USER_
> User info.

**fl** _USER_
> Follow user.

**ufl** _USER_
> Unfollow user.

# DESCRIPTION

**rainbowstream** is a terminal Twitter client with color output. It provides full Twitter functionality from the command line.

Real-time streaming shows new tweets as they arrive. Timeline updates automatically.

Interactive mode provides a Twitter shell. Commands manage posting, following, and interaction.

Color themes make tweets readable. Syntax highlighting for usernames and hashtags.

Image preview displays inline pictures. ASCII art rendering in terminal.

# CAVEATS

Requires Twitter API access. API changes may break functionality. Rate limits apply.

# HISTORY

**Rainbowstream** was created for terminal-based Twitter access. It brings social media to the command line with colorful, readable output.

# SEE ALSO

[twurl](/man/twurl)(1), [t](/man/t)(1)
