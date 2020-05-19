Feature: As a client i need to search snapcraft documentation


      @Smoke @doc
      Scenario Outline: The client search a specific topic
        Given The client is in snapcraft page
        When The client click the documentation button
        And The client search topic <topic>
        Then The client verify that results are shown for <topic>

        Examples:
        |topic|
        |publish|
        |Installing snapd|

        @Smoke
        Scenario: The client click a specific topic
        Given The client is in snapcraft page
        When The client click the documentation button
        And The client click in "Install the daemon"
        Then The client show the selected topic

        @Smoke
         Scenario: The client search for a special character
         Given The client is in snapcraft page
         When The client click the documentation button
         And The client search the character $
         Then The client see an error