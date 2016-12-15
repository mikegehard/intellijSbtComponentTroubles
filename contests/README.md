# Contests API

This API handles pitting two pets against one another in a battle.

## Running app

`activator run`

## Running tests

`activator test`

## Building artifact

`activator dist`

## Deploying to Cloud Foundry

First time:

1. `cf push contests --random-route --no-start -p target/universal/battle-pets-contests-[version].zip`

2. `cf set-env contests APPLICATION_SECRET somereallylongstring`

3. `cf start contests`

Subsequent times:

1. `cf push contests -p target/universal/battle-pets-contests-[version].zip`