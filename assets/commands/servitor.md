# TAGLINE

Serverless command-line Fediverse client

# TLDR

**View a user's profile**

```servitor open [@user@instance.org]```

**Open a fediverse link**

```servitor open [https://instance.org/post/123]```

**View a named feed**

```servitor feed [my-feed]```

# SYNOPSIS

**servitor** _command_ [_arguments_]

# DESCRIPTION

**servitor** is a terminal-based ActivityPub/Fediverse client that does not require running a server. It pulls posts directly from source sites, avoiding defederation issues, and stores subscriptions locally so you can follow people without sending follow requests. It supports Mastodon, Lemmy, PeerTube, and other fediverse platforms.

# HISTORY

**servitor** was created by **Benton Edmondson** (BentonEdmondson) and is written in **Go**.

# SEE ALSO

[toot](/man/toot)(1), [tut](/man/tut)(1), [tuisky](/man/tuisky)(1)
