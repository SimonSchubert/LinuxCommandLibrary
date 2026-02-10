# TAGLINE

manages Linode support tickets

# TLDR

**List tickets**

```linode-cli tickets list```

**View ticket**

```linode-cli tickets view [ticket_id]```

**Create ticket**

```linode-cli tickets create --summary "[Issue summary]" --description "[Details]"```

**Reply to ticket**

```linode-cli tickets reply [ticket_id] --description "[Reply text]"```

# SYNOPSIS

**linode-cli tickets** _command_ [_options_]

# PARAMETERS

**list**
> List support tickets.

**view** _id_
> View ticket details.

**create**
> Create support ticket.

**reply** _id_
> Reply to ticket.

**--summary** _text_
> Ticket summary.

**--description** _text_
> Ticket description.

# DESCRIPTION

**linode-cli tickets** manages Linode support tickets. Create, view, and reply to support requests. Part of Linode CLI for cloud infrastructure management.

# SEE ALSO

[linode-cli](/man/linode-cli)(1)

