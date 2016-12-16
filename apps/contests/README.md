# Contests API

This API handles pitting two pets against one another in a battle.

**Note all of these commands are run from the root of the project.**

## Running app

`sbt contests/run`

## Running tests

`sbt contests/test`

## Building artifact

`sbt contests/dist`

## Deploying to Cloud Foundry

First time:

1. `cf push contests --random-route --no-start -p apps/contests/target/universal/battle-pets-contests-[version].zip`

2. `cf set-env contests APPLICATION_SECRET somereallylongstring`

3. `cf start contests`

Subsequent times:

1. `cf push contests -p apps/contests/target/universal/battle-pets-contests-[version].zip`