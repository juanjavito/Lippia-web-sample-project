Feature: As a client i need to search in snapcraft an app


      @Smoke
      Scenario Outline: The client search for an application that exist
        Given The client is in snapcraft home page
        When The client click the store button
        And The client search for <app>
        Then The client verify that results are shown properly for <app>

        Examples:
        |app|
        |intellij|
        |Eclipse|
        |Zoom|

    @Smoke
      Scenario Outline: The client search for an application that doesn't exist
        Given The client is in snapcraft home page
        When The client click the store button
        And The client search for <app>
        Then The client verify that no results are shown for <app>

        Examples:
        |app|
        |fortnite battleroyale|
        |nvidia drivers|

        @Smoke
        Scenario: The client search for a special character
        Given The client is in snapcraft home page
        When The client click the store button
        And The client search for $
        Then The client sees an error